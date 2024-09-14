//////////////////////////////////////
// CSS
//////////////////////////////////////
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
        display: flex;
        justify-content: center;
        align-items: center;
    }

    #main {
        margin: 2rem 0;
    }

    #form-header,
    #form-body {
        background-color: white;
        padding: 2rem;
    }

    #form-header {
        margin-bottom: 1rem;
    }

    .form-field {
        display: flex;
        width: 100%;
        margin: 1rem 0;
    }

    #form-name,
    #form-address,
    #form-date-of-birth {
        width: 40%;
    }

    textarea {
        font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
    }

    .form-label-input {
        width: 50%;
    }
`
head.appendChild(style)



//////////////////////////////////////
// HTML
//////////////////////////////////////
const formHeader = document.createElement('div')
formHeader.id = 'form-header'
formHeader.innerHTML = `
    <h1>Formulir Pendaftaran Penjaga Galaksi Bima Sakti</h1>
`

const nameFormField = document.createElement('div')
nameFormField.id = 'name-form-field'
nameFormField.className = 'form-field'
nameFormField.innerHTML = `
    <label for="form-name" class="form-label-input">Nama</label>
    <input type="text" name="name" id="form-name" class="form-input" placeholder="Contoh: Andi Rekayasa">
`

const addressFormField = document.createElement('div')
addressFormField.id = 'address-form-field'
addressFormField.className = 'form-field'
addressFormField.innerHTML = `
    <label for="form-address" class="form-label-input">Alamat</label>
    <textarea name="address" id="form-address" class="form-input" rows="5" cols="30" placeholder="Contoh: Jalan Mawar No. 23 Desa Mekar Kecamatan Jaya Kabupaten Sukses"></textarea>
`

const dateOfBirthFormField = document.createElement('div')
dateOfBirthFormField.id = 'date-of-birth-form-field'
dateOfBirthFormField.className = 'form-field'
dateOfBirthFormField.innerHTML = `
    <label for="form-date-of-birth" class="form-label-input">Tanggal lahir</label>
    <input type="date" name="date-of-birth" id="form-date-of-birth" class="form-input">

`

const genderFormField = document.createElement('div')
genderFormField.id = 'gender-form-field'
genderFormField.className = 'form-field'
genderFormField.innerHTML = `
    <div class="form-label-input">
        Jenis kelamin
    </div>
    <div>
        <div>
            <input type="radio" name="gender" id="form-gender-male" class="form-input form-gender" value="male">
            Laki-laki
        </div>
        <div>
            <input type="radio" name="gender" id="form-gender-female" class="form-input form-gender" value="female">
            Perempuan
        </div>
        <input type="hidden" name="gender" id="form-gender-null" class="form-input" value="">
    </div>
`

const hobbiesFormField = document.createElement('div')
hobbiesFormField.id = 'hobbies-form-field'
hobbiesFormField.className = 'form-field'
hobbiesFormField.innerHTML = `
    <div class="form-label-input">Hobi</div>
    <div>
        <div>
            <input type="checkbox" name="hobbies" class="form-input form-hobbies" value="swimming">
            Berenang
        </div>
        <div>
            <input type="checkbox" name="hobbies" class="form-input form-hobbies" value="reading">
            Membaca
        </div>
        <div>
            <input type="checkbox" name="hobbies" class="form-input form-hobbies" values="drawing">
            Menggambar
        </div>
        <div>
            <input type="checkbox" name="hobbies" class="form-input form-hobbies" value="others">
            Lain-lain
        </div>
        <input type="hidden" name="hobbies" id="form-hobbies-null" class="form-input" value="">
    </div>
`

const jobsFormField = document.createElement('div')
jobsFormField.id = 'jobs-form-field'
jobsFormField.className = 'form-field'
jobsFormField.innerHTML = `
    <div class="form-label-input">Pekerjaan</div>
    <div>
        <div>
            <input type="checkbox" name="jobs" class="form-input form-jobs" value="soldier">
            Tentara
        </div>
        <div>
            <input type="checkbox" name="jobs" class="form-input form-jobs" value="programmer">
            Programmer
        </div>
        <div>
            <input type="checkbox" name="jobs" class="form-input form-jobs" value="designer">
            Designer
        </div>
        <div>
            <input type="checkbox" name="jobs" class="form-input form-jobs" value="3d-illustrator">
            3D illustrator
        </div>
        <div>
            <input type="checkbox" name="jobs" class="form-input form-jobs" value="others">
            Lain-lain
        </div>
        <input type="hidden" name="jobs" id="form-jobs-null" class="form-input" value="">
    </div>
`

const aggrementFormField = document.createElement('div')
aggrementFormField.id = 'aggrement-input'
aggrementFormField.innerHTML = `
    <input type="checkbox">
    Saya telah berkomitmen untuk menjadi bagian dari pasukan galaksi Bima Sakti
`

const buttonFormSubmit = document.createElement('button')
buttonFormSubmit.type = 'submit'
buttonFormSubmit.textContent = 'Kirim'

const formBody = document.createElement('form')
formBody.id = 'form-body'
formBody.action = '/register'
formBody.method = 'post'
formBody.appendChild(nameFormField)
formBody.appendChild(addressFormField)
formBody.appendChild(dateOfBirthFormField)
formBody.appendChild(genderFormField)
formBody.appendChild(hobbiesFormField)
formBody.appendChild(jobsFormField)
formBody.appendChild(aggrementFormField)
formBody.appendChild(buttonFormSubmit)

const main = document.getElementById('main')
main.appendChild(formHeader)
main.appendChild(formBody)



//////////////////////////////////////
// JAVASCRIPT
//////////////////////////////////////
const formInput = document.querySelectorAll('.form-input')
const nameInputField = document.getElementById('form-name')
const addressInputField = document.getElementById('address-form-field')
const dateOfBirthInputField = document.getElementById('form-date-of-birth')
const genderInputField = document.getElementsByClassName('form-gender')
const hobbiesInputField = document.getElementsByClassName('form-hobbies')
const jobsInputField = document.getElementsByClassName('form-jobs')

formInput.forEach(el => {
    el.addEventListener('input', function () {
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
form.addEventListener('submit', function (event) {
    isFormDataComplete = true
    event.preventDefault()

    const formData = new FormData(this)

    let genderInput = 0
    let hobbiesInput = 0
    let jobsInput = 0

    formData.forEach((value, key) => {
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

    if (genderInput == 1) {
        Array.from(genderInputField).forEach(el => {
            el.style.borderRadius = '50%'
            el.style.border = '2px solid red'
            el.style.outline = '5px solid rgba(255, 0, 0, 0.2)'
        })
    }

    if (hobbiesInput == 1) {
        Array.from(hobbiesInputField).forEach(el => {
            el.style.borderRadius = '.25rem'
            el.style.border = '2px solid red'
            el.style.outline = '5px solid rgba(255, 0, 0, 0.2)'
        })
    }

    if (jobsInput == 1) {
        Array.from(jobsInputField).forEach(el => {
            el.style.borderRadius = '.25rem'
            el.style.border = '2px solid red'
            el.style.outline = '5px solid rgba(255, 0, 0, 0.2)'
        })
    }

    if (!isFormDataComplete) {
        alert('Formulir tidak bisa dikirim! Pastikan seluruh data sudah terisi terlebih dahulu!')
    } else {
        document.getElementById('form-gender-null').disabled = true
        document.getElementById('form-hobbies-null').disabled = true
        document.getElementById('form-jobs-null').disabled = true
        this.submit()
    }
})