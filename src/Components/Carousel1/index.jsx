import React from "react";
import { Link } from "react-router-dom";

import Moveis from './img/moveis-card.jpg';
import Computadores from './img/computador-card.jpg';
import Livros from './img/livros-card.jpg';
import BolsaE from './img/bolsas-card.jpg';
import Perifericos from './img/perifericos-card.jpg';

import './index.css';

function Carousel() {
    return (
        <section id="categorias" className=" mt-1 p-2 card-text">
            <div className="container pb-2 pt-2">
                <h3>Doações</h3>
                <div id="carouselCategorias" className="carousel carousel-dark slide" data-bs-ride="carousel">
                    <div className="carousel-indicators">
                        <button type="button" data-bs-target="#carouselCategorias" data-bs-slide-to="0" className="active"
                            aria-current="true" aria-label="Slide 1"></button>
                        <button type="button" data-bs-target="#carouselCategorias" data-bs-slide-to="1"
                            aria-label="Slide 2"></button>
                    </div>
                    <div className="carousel-inner">
                        <div className="carousel-item active" data-bs-interval="10000">
                            <div className="row row-cols-1 row-cols-md-3 g-4">

                                <div className="col">
                                    <div className="card card-text p-2">
                                        <figure><img src={Moveis} alt="Moveis" id="img-card" /></figure>
                                        <div className="texto-card">
                                            <h5>Móveis para estudo</h5>
                                            <p>Doar seus móveis usados ou novos é uma forma de dar conforto aos
                                                estudantes, muitas pessoas estudam no chão!</p>
                                        </div>
                                        <div><Link target="_blank" to="" type="button"
                                            className="btn btn-dark">Clique para doar</Link></div>
                                    </div>
                                </div>
                                <div className="col">
                                    <div className="card card-text p-2">
                                        <figure><img src={Computadores} alt="Computadores" id="img-card" />
                                        </figure>
                                        <div className="texto-card">
                                            <h5>Computadores</h5>
                                            <p>Computadores são ferramentas de acesso ao conhecimento universal, por
                                                isso é um dos itens mais requisitados, doe o seu. </p>
                                        </div>
                                        <div><Link target="_blank" to="" type="button"
                                            className="btn btn-dark">Clique para doar</Link></div>
                                    </div>
                                </div>
                                <div className="col">
                                    <div className="card  card-text p-2">
                                        <figure><img src={Livros} alt="Livros" id="img-card" /></figure>
                                        <div className="texto-card">
                                            <h5>Livros</h5>
                                            <p>Já precisou entender um assunto que nem com ajuda da internet você
                                                consegue? pois é! os livros tem esse poder.</p>
                                        </div>
                                        <div><Link target="_blank" to="" type="button"
                                            className="btn btn-dark">Clique para doar</Link></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div className="carousel-item" data-bs-interval="10000">
                            <div className="row row-cols-1 row-cols-md-3 g-4">
                                <div className="col">
                                    <div className="card  card-text p-2">
                                        <figure><img src={Perifericos} alt="Perifericos" id="img-card" />
                                        </figure>
                                        <div className="texto-card">
                                            <h5>Periféricos</h5>
                                            <p>Coisas simples para alguns, para outros são Link chave para o futuro; mouses,
                                                teclados, webcams e fones estão na lista de mais requisitados</p>
                                        </div>
                                        <div><Link target="_blank" to="" type="button" className="btn btn-dark">Clique
                                            para doar</Link></div>
                                    </div>
                                </div>
                                <div className="col">
                                    <div className="card  card-text p-2">
                                        <figure><img src={BolsaE} alt="Bolsas de Estudos" id="img-card" />
                                        </figure>
                                        <div className="texto-card">
                                            <h5>Bolsas de estudos</h5>
                                            <p> Sabemos o poder transformador da educação, por isso bolsas de estudos em
                                                cursos online ou presenciais também podem ser doados</p>
                                        </div>
                                        <div><Link target="_blank" to="" type="button" className="btn btn-dark">Clique
                                            para doar</Link>
                                        </div>
                                    </div>
                                </div>
                                <div className="col">
                                    <div className="card card-text p-2">
                                        <figure><img src={Perifericos} alt="Perifericos" id="img-card" />
                                        </figure>
                                        <div className="texto-card">
                                            <h5>Material Escolar</h5>
                                            <p>Crianças que estão matriculadas na rede pública de ensino, em alguns casos,
                                                não tem sequer um caderno, lápis ou borracha</p>
                                        </div>
                                        <div><Link target="_blank" to="" type="button" className="btn btn-dark">Clique
                                            para doar</Link></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <button className="carousel-control-prev" type="button" data-bs-target="#carouselCategorias"
                            data-bs-slide="prev">
                            <span className="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span className="visually-hidden">Previous</span>
                        </button>
                        <button className="carousel-control-next" type="button" data-bs-target="#carouselCategorias"
                            data-bs-slide="next">
                            <span className="carousel-control-next-icon" aria-hidden="true"></span>
                            <span className="visually-hidden">Next</span>
                        </button>
                    </div>
                </div>
            </div>
        </section>
    );
}

export default Carousel;