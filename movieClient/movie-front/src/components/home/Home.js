import React from "react";
import Hero from "../hero/Hero";

const Home = ({ movies }) => {
  return (
    <div>{movies ? <Hero movies={movies} /> : <p>Loading movies ...</p>}</div>
  );
};

export default Home;
