.class public final Lz9/D;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lx9/u;

.field private b:Z


# direct methods
.method public constructor <init>(Lv9/f;)V
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lx9/u;

    new-instance v1, Lz9/D$a;

    invoke-direct {v1, p0}, Lz9/D$a;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, p1, v1}, Lx9/u;-><init>(Lv9/f;Lx7/p;)V

    iput-object v0, p0, Lz9/D;->a:Lx9/u;

    return-void
.end method

.method public static final synthetic a(Lz9/D;Lv9/f;I)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lz9/D;->e(Lv9/f;I)Z

    move-result p0

    return p0
.end method

.method private final e(Lv9/f;I)Z
    .locals 1

    .prologue
    invoke-interface {p1, p2}, Lv9/f;->i(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Lv9/f;->h(I)Lv9/f;

    move-result-object p1

    invoke-interface {p1}, Lv9/f;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lz9/D;->b:Z

    return p1
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lz9/D;->b:Z

    return v0
.end method

.method public final c(I)V
    .locals 1

    iget-object v0, p0, Lz9/D;->a:Lx9/u;

    invoke-virtual {v0, p1}, Lx9/u;->a(I)V

    return-void
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, Lz9/D;->a:Lx9/u;

    invoke-virtual {v0}, Lx9/u;->d()I

    move-result v0

    return v0
.end method
