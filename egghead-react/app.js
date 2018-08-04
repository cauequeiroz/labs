const rootElement = document.querySelector('#root')

const element = document.createElement('div')
element.textContent = 'Welcome!'
element.className = 'container'

rootElement.appendChild(element)