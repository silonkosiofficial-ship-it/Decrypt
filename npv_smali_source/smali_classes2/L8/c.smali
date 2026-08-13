.class final LL8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LO7/f0;

.field private final b:LF8/E;

.field private final c:LF8/E;


# direct methods
.method public constructor <init>(LO7/f0;LF8/E;LF8/E;)V
    .locals 1

    const-string v0, "typeParameter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inProjection"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outProjection"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL8/c;->a:LO7/f0;

    iput-object p2, p0, LL8/c;->b:LF8/E;

    iput-object p3, p0, LL8/c;->c:LF8/E;

    return-void
.end method


# virtual methods
.method public final a()LF8/E;
    .locals 1

    iget-object v0, p0, LL8/c;->b:LF8/E;

    return-object v0
.end method

.method public final b()LF8/E;
    .locals 1

    iget-object v0, p0, LL8/c;->c:LF8/E;

    return-object v0
.end method

.method public final c()LO7/f0;
    .locals 1

    iget-object v0, p0, LL8/c;->a:LO7/f0;

    return-object v0
.end method

.method public final d()Z
    .locals 3

    sget-object v0, LG8/e;->a:LG8/e;

    iget-object v1, p0, LL8/c;->b:LF8/E;

    iget-object v2, p0, LL8/c;->c:LF8/E;

    invoke-interface {v0, v1, v2}, LG8/e;->d(LF8/E;LF8/E;)Z

    move-result v0

    return v0
.end method
