const rootElement = document.querySelector('#root')

const element = React.createElement('div', { className: 'container' }, 'Welcome!')

ReactDOM.render(element, rootElement)