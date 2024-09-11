const weekOptions = document.querySelectorAll('.week-option');

let currentWeek = 0;
weekOptions.forEach((week, index) => {
    week.addEventListener('click', function() {
        weekOptions[currentWeek].style.backgroundColor = 'white'
        weekOptions[currentWeek].style.color = 'black'
        weekOptions[currentWeek].style.fontWeight = 'normal'
        this.style.backgroundColor = 'black'
        this.style.color = 'white'
        this.style.fontWeight = 'bold'
        currentWeek = index
    })
});