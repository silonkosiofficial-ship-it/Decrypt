.class LC5/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz5/g;


# instance fields
.field private a:Z

.field private b:Z

.field private c:Lz5/c;

.field private final d:LC5/f;


# direct methods
.method constructor <init>(LC5/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LC5/i;->a:Z

    iput-boolean v0, p0, LC5/i;->b:Z

    iput-object p1, p0, LC5/i;->d:LC5/f;

    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    iget-boolean v0, p0, LC5/i;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LC5/i;->a:Z

    return-void

    :cond_0
    new-instance v0, Lz5/b;

    const-string v1, "Cannot encode a second value in the ValueEncoderContext"

    invoke-direct {v0, v1}, Lz5/b;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method b(Lz5/c;Z)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, LC5/i;->a:Z

    iput-object p1, p0, LC5/i;->c:Lz5/c;

    iput-boolean p2, p0, LC5/i;->b:Z

    return-void
.end method

.method public e(Ljava/lang/String;)Lz5/g;
    .locals 3

    invoke-direct {p0}, LC5/i;->a()V

    iget-object v0, p0, LC5/i;->d:LC5/f;

    iget-object v1, p0, LC5/i;->c:Lz5/c;

    iget-boolean v2, p0, LC5/i;->b:Z

    invoke-virtual {v0, v1, p1, v2}, LC5/f;->o(Lz5/c;Ljava/lang/Object;Z)Lz5/e;

    return-object p0
.end method

.method public f(Z)Lz5/g;
    .locals 3

    invoke-direct {p0}, LC5/i;->a()V

    iget-object v0, p0, LC5/i;->d:LC5/f;

    iget-object v1, p0, LC5/i;->c:Lz5/c;

    iget-boolean v2, p0, LC5/i;->b:Z

    invoke-virtual {v0, v1, p1, v2}, LC5/f;->l(Lz5/c;ZZ)LC5/f;

    return-object p0
.end method
