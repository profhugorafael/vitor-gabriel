import { Author } from "../User";

export function Noticia({title, user, content}) {

  const { name:author , email} = user;

  return (
    <div>
      <h1>{title}</h1>
      <Author author={author} email={email} />
      <article>
        {content}
      </article>
    </div>
  )

}