const head = document.getElementsByTagName('head')[0]
const style = document.createElement('style')
style.textContent = `
    body {
        background-color: lightgray;
        font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
        margin: 0;
        min-height: 100vh;
        min-width: 100vw;
        max-width: 100vw;
        max-height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    form {
        background-color: white;
        padding: 2rem;;
    }

    .form-field {
        display: flex;
        width: 100%;
        margin: 1rem 0;
    }

    .form-label-input {
        width: 50%;
    }
`
head.appendChild(style)

const main = document.getElementById('main')
main.innerHTML = `
    <form action="/register" method="post">
        <div class="form-field">
            <label for="form-name" class="form-label-input">Nama</label>
            <input type="text" name="name" id="form-name" class="form-input" placeholder="Contoh: Andi Rekayasa">
        </div>
        <div class="form-field">
            <label for="form-address" class="form-label-input">Alamat</label>
            <textarea name="address" id="form-address" class="form-input" rows="5" cols="30" placeholder="Contoh: Jalan Mawar No. 23 Desa Mekar Kecamatan Jaya Kabupaten Sukses"></textarea>
        </div>
        <div class="form-field">
            <label for="form-date-of-birth" class="form-label-input">Tanggal lahir</label>
            <input type="date" name="date-of-birth" id="form-date-of-birth" class="form-input">
        </div>
        <div class="form-field">
            <div class="form-label-input">
                Jenis kelamin
            </div>
            <div>
                <div>
                    <input type="radio" name="gender" id="form-gender-male" class="form-input" value="male">
                    Laki-laki
                </div>
                <div>
                    <input type="radio" name="gender" id="form-gender-female" class="form-input"value="female">
                    Perempuan
                </div>
                <input type="hidden" name="gender" id="form-gender-null" value="">
            </div>
        </div>
        <div class="form-field">
            <div class="form-label-input">Hobi</div>
            <div>
                <div>
                    <input type="checkbox" name="hobbies" value="swimming">
                    Berenang
                </div>
                <div>
                    <input type="checkbox" name="hobbies" value="reading">
                    Membaca
                </div>
                <div>
                    <input type="checkbox" name="hobbies" values="drawing">
                    Menggambar
                </div>
                <div>
                    <input type="checkbox" name="hobbies" value="others">
                    Lain-lain
                </div>
                <input type="hidden" name="hobbies" id="form-hobbies-null" value="">
            </div>
        </div>
        <div class="form-field">
            <div class="form-label-input">Pekerjaan</div>
            <div>
                <div>
                    <input type="checkbox" name="jobs" value="soldier">
                    Tentara
                </div>
                <div>
                    <input type="checkbox" name="jobs" value="programmer">
                    Programmer
                </div>
                <div>
                    <input type="checkbox" name="jobs" value="designer">
                    Designer
                </div>
                <div>
                    <input type="checkbox" name="jobs" value="3d-illustrator">
                    3D illustrator
                </div>
                <div>
                    <input type="checkbox" name="jobs" value="others">
                    Lain-lain
                </div>
                <input type="hidden" name="jobs" id="form-jobs-null" value="">
            </div>
        </div>

        <div id="aggrement-input">
            <input type="checkbox">
            Saya sudah menyetujui seluruh persyaratan yang ada dan bersedia data saya digunakan di sistem kami
        </div>

        <button type="submit">Kirim</button>
    </form>
`

const formInput = document.querySelectorAll('.form-input')

formInput.forEach(el => {
    el.addEventListener('input', function() {
        if (this.value == '') {
            this.style.borderRadius = '.25rem'
            this.style.border = '2px solid red'
            this.style.outline = '5px solid rgba(255, 0, 0, 0.2)'
        } else {
            this.style.border = '1px solid gray'
            this.style.outline = 'none'
        }
    })
})

let isFormDataComplete = true

const form = document.getElementsByTagName('form')[0]
form.addEventListener('submit', function(event) {
    event.preventDefault()

    const formData = new FormData(this)

    let genderInput = 0
    let hobbiesInput = 0
    let jobsInput = 0
    
    formData.forEach((value, key) => {
        console.log('value: ' + value)
        
        switch (key) {
            case 'name':
            case 'address':
            case 'date-of-birth':            
                if (value === '') {
                    isFormDataComplete = false
                }
                break;
            case 'gender':
                genderInput++
                break;
            case 'hobbies':
                hobbiesInput++
                break;
            case 'jobs':
                jobsInput++
                break;
        }
    })

    if (genderInput == 1 || hobbiesInput == 1 || jobsInput == 1) {
        isFormDataComplete = false
    }

    document.getElementById('form-gender-null').disabled = true
    document.getElementById('form-gender-null').disabled = true
    document.getElementById('form-gender-null').disabled = true

    if (!isFormDataComplete) {
        alert('Formulir tidak bisa dikirim! Pastikan seluruh data sudah terisi terlebih dahulu!')
    } else {
        this.submit()
    }
})

// function inputCheckedHandler(el) {
//     if (!el.checked) {
//         isFormDataComplete = false
//     }
// }

// const genderForm = document.querySelectorAll('input[name="gender"')
// genderForm.forEach(el => {
//     inputCheckedHandler(el)
// })

// const hobbiesForm = document.querySelectorAll('input[name="hobbies"')
// hobbiesForm.forEach(el => {
//     inputCheckedHandler(el)
// })

// const jobsForm = document.querySelectorAll('input[name="jobs"')
// jobsForm.forEach(el => {
//     inputCheckedHandler(el)
// })