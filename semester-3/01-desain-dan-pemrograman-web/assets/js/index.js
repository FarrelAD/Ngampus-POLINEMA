const weekOptions = document.querySelectorAll('.week-option')
const weekProjectsData = document.querySelectorAll('.week-project-data')

let currentWeek = 0;
weekOptions.forEach((week, index) => {
    week.addEventListener('click', function() {
        weekProjectsData[currentWeek].style.display = 'none'
        weekOptions[currentWeek].style.backgroundColor = 'white'
        weekOptions[currentWeek].style.color = 'black'
        weekOptions[currentWeek].style.fontWeight = 'normal'
        currentWeek = index
        weekProjectsData[currentWeek].style.display = 'grid'
        this.style.backgroundColor = 'black'
        this.style.color = 'white'
        this.style.fontWeight = 'bold'
    })
});