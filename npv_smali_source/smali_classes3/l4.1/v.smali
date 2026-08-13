.class final Ll4/v;
.super Ll4/a;
.source "SourceFile"


# instance fields
.field private final a:Ll4/P;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ll4/a;-><init>()V

    new-instance v0, Ll4/P;

    invoke-direct {v0}, Ll4/P;-><init>()V

    iput-object v0, p0, Ll4/v;->a:Ll4/P;

    return-void
.end method


# virtual methods
.method public final a(Ll4/i;)Ll4/a;
    .locals 2

    new-instance v0, Ll4/p;

    invoke-direct {v0, p0, p1}, Ll4/p;-><init>(Ll4/v;Ll4/i;)V

    iget-object p1, p0, Ll4/v;->a:Ll4/P;

    sget-object v1, Ll4/n;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v1, v0}, Ll4/P;->f(Ljava/util/concurrent/Executor;Ll4/h;)Ll4/l;

    return-object p0
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Ll4/v;->a:Ll4/P;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll4/P;->v(Ljava/lang/Object;)Z

    return-void
.end method
