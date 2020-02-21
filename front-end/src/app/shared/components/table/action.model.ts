export class Action<T> {
  title: string;
  icon: string;
  handler: (obj: T) => any;
}
