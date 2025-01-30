const peliculas = [
    { titulo: "Super Mario Bros", genero: "Animación", año: 2023, image: "Mario.jpg" },
    { titulo: "El Gato con Botas", genero: "Animación", año: 2022, image: "gato.jpg" },
    { titulo: "Spider-Man", genero: "Acción", año: 2021, image: "spiderman.jpeg" },
    { titulo: "Tadeo Jones 3", genero: "Animación", año: 2022, image: "tadeojones.jpg" },
    { titulo: "Momias", genero: "Animación", año: 2023, image: "momias.jpg" },
    { titulo: "Sonic 2", genero: "Aventura", año: 2022, image: "sonic.jpg" },
    { titulo: "Una familia de superhéroes", genero: "Animación", año: 2023, image: "superheroes.jpg" },
    { titulo: "Ruby y el último dragón adolescente", genero: "Animación", año: 2023, image: "kraken.jpg" },
    { titulo: "Sing 2", genero: "Animación", año: 2021, image: "sing.jpg" },
    { titulo: "Rally Road Racers", genero: "Aventura", año: 2023, image: "rally.png" },
    { titulo: "Inspector Sun", genero: "Animación", año: 2023, image: "bug detective.jpg" },
    { titulo: "Mi amigo el cocodrilo", genero: "Aventura", año: 2022, image: "cocodrilo.jpg" },
    { titulo: "La Sirenita", genero: "Fantasía", año: 2023, image: "sirenita.jpeg" },
    { titulo: "Las Aventuras Espaciales", genero: "Ciencia Ficción", año: 2023, image: "aventurasespaciales.jpg" },
    { titulo: "Cars", genero: "Animación", año: 2023, image: "Cars.jpg" } ,
    { titulo: "Piratas Mágicos", genero: "Aventura", año: 2023, image: "piratas.jpg" } ,
    { titulo: "Jurassic World", genero: "Aventura", año: 2023, image: "dinosaurios.jpg" } ,
    { titulo: "Escuela para Fracasados", genero: "Comedia", año: 2023, image: "fracasados.jpg" } ,
];


// Función para obtener géneros únicos
function obtenerGeneros() {
    return [...new Set(peliculas.map(pelicula => pelicula.genero))];
}

// Función para crear y mostrar las tarjetas de películas
function mostrarPeliculas(peliculasFiltradas = peliculas) {
    const contenedor = document.querySelector('.movies-grid');
    contenedor.innerHTML = '';

    if (peliculasFiltradas.length === 0) {
        contenedor.innerHTML = '<p class="no-results">No se encontraron películas que coincidan con tu búsqueda</p>';
        return;
    }

    peliculasFiltradas.forEach(pelicula => {
        const card = document.createElement('div');
        card.className = 'movie-card';
        card.innerHTML = `
            <div class="movie-image">${obtenerIniciales(pelicula.titulo)}</div>
            <div class="movie-title">${pelicula.titulo}</div>
            <div class="movie-info">
                <span>${pelicula.genero}</span>
                <span>${pelicula.año}</span>
            </div>
        `;
        contenedor.appendChild(card);
    });
}

// Función auxiliar para obtener iniciales
function obtenerIniciales(titulo) {
    return titulo
        .split(' ')
        .map(palabra => palabra[0])
        .join('')
        .substring(0, 2)
        .toUpperCase();
}

// Función para crear los controles de filtrado
function crearControlesFiltrado() {
    const header = document.querySelector('.header');
    const controlesHTML = `
        <div class="controls">
            <div class="search-container">
                <input type="text" id="searchInput" placeholder="Buscar película...">
                <button id="searchButton">Buscar</button>
            </div>
            <select id="genreSelect">
                <option value="">Todos los géneros</option>
                ${obtenerGeneros().map(genero => 
                    `<option value="${genero}">${genero}</option>`
                ).join('')}
            </select>
            <button id="sortButton">Ordenar por año</button>
        </div>
    `;
    header.insertAdjacentHTML('afterend', controlesHTML);
}

// Función para inicializar eventos
function inicializarEventos() {
    const searchInput = document.getElementById('searchInput');
    const searchButton = document.getElementById('searchButton');
    const genreSelect = document.getElementById('genreSelect');
    const sortButton = document.getElementById('sortButton');
    let ordenAscendente = true;

    searchButton.addEventListener('click', () => {
        const searchTerm = searchInput.value.toLowerCase();
        const peliculasFiltradas = peliculas.filter(pelicula =>
            pelicula.titulo.toLowerCase().includes(searchTerm)
        );
        mostrarPeliculas(peliculasFiltradas);
    });

    genreSelect.addEventListener('change', (e) => {
        const generoSeleccionado = e.target.value;
        const peliculasFiltradas = generoSeleccionado 
            ? peliculas.filter(pelicula => pelicula.genero === generoSeleccionado)
            : peliculas;
        mostrarPeliculas(peliculasFiltradas);
    });

    sortButton.addEventListener('click', () => {
        const peliculasOrdenadas = [...peliculas].sort((a, b) => {
            return ordenAscendente 
                ? a.año - b.año 
                : b.año - a.año;
        });
        ordenAscendente = !ordenAscendente;
        sortButton.textContent = `Ordenar por año (${ordenAscendente ? '↑' : '↓'})`;
        mostrarPeliculas(peliculasOrdenadas);
    });
}

// Función principal de inicialización
function inicializarApp() {
    crearControlesFiltrado();
    mostrarPeliculas();
    inicializarEventos();
}

// Iniciar la aplicación cuando el DOM esté listo
document.addEventListener('DOMContentLoaded', inicializarApp);