class ProjectCard extends HTMLElement {
    constructor() {
        super()

        const webSrc = this.getAttribute('web-src') || '#'
        const webImgPreviewSrc = this.getAttribute('web-img-preview-src') || ''
        const projectTitle = this.getAttribute('project-title') || 'Project title'
        const projectDescription = this.getAttribute('project-desc') || 'Project description'

        const shadow = this.attachShadow({ mode: 'open' })
        shadow.innerHTML = `
            <a class="project-card" href="${webSrc}" target="_blank">
                <div class="project-web-preview">
                    <img src="${webImgPreviewSrc}" alt="Web page preview" class="img-web-preview">
                </div>
                <div class="project-content">
                    <h4 class="project-title">${projectTitle}</h4>
                    <p class="short-description-card">${projectDescription}</p>
                </div>
            </a>
        `

        const style = document.createElement('style')
        style.textContent = `
            .project-card {
                display: block;
                width: 100%;
                height: 95%;
                border: 2px solid black;
                border-radius: 0.4rem;
                transition: box-shadow 0.3s ease;
                text-decoration: none;
                color: black;
            }

            .project-card:hover {
                box-shadow: .2rem .2rem 0 0 gray;
                cursor: pointer;
            }
            
            .project-content {
                padding: 1rem;
                padding-top: 0.3rem;
            }

            .img-web-preview {
                width: 100%;
                height: 135px;
                object-fit: cover;
                border-top-left-radius: 0.4rem;
                border-top-right-radius: 0.4rem;
            }

            .project-title:hover {
                cursor: pointer;
                text-decoration: underline;
            }

            .short-description-card {
                font-size: 10px;
            }
        `
        shadow.append(style)
    }

    static get observedAttributes() {
        return ['web-src', 'web-img-preview-src', 'project-title', 'project-desc']
    }

    attributeChangedCallback(name, oldValue, newValue) {
        const shadowRoot = this.shadowRoot
        switch (name) {
            case 'web-src':
                shadowRoot.querySelector('.project-card').setAttribute('href', newValue)
                break;
            case 'web-img-preview-src':
                shadowRoot.querySelector('.img-web-preview').setAttribute('src', newValue)
                console.log(shadowRoot.querySelector('.img-web-preview').getAttribute('src'))
                break;
            case 'project-title':
                shadowRoot.querySelector('.project-title').textContent = newValue
                break;
            case 'project-desc':
                shadowRoot.querySelector('.short-description-card').textContent = newValue
                break;
            default:
                break;
        }
    }
}

customElements.define('project-card', ProjectCard)