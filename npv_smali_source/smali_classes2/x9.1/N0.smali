.class public final Lx9/N0;
.super Lx9/p0;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# static fields
.field public static final c:Lx9/N0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx9/N0;

    invoke-direct {v0}, Lx9/N0;-><init>()V

    sput-object v0, Lx9/N0;->c:Lx9/N0;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    sget-object v0, Li7/J;->D:Li7/J$a;

    invoke-static {v0}, Lu9/a;->v(Li7/J$a;)Lt9/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lx9/p0;-><init>(Lt9/b;)V

    return-void
.end method


# virtual methods
.method protected A([S)I
    .locals 1

    const-string v0, "$this$collectionSize"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Li7/K;->M([S)I

    move-result p1

    return p1
.end method

.method protected B()[S
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Li7/K;->e(I)[S

    move-result-object v0

    return-object v0
.end method

.method protected C(Lw9/d;ILx9/M0;Z)V
    .locals 0

    const-string p4, "decoder"

    invoke-static {p1, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "builder"

    invoke-static {p3, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/p0;->a()Lv9/f;

    move-result-object p4

    invoke-interface {p1, p4, p2}, Lw9/d;->E(Lv9/f;I)Lw9/h;

    move-result-object p1

    invoke-interface {p1}, Lw9/h;->A()S

    move-result p1

    invoke-static {p1}, Li7/J;->g(S)S

    move-result p1

    invoke-virtual {p3, p1}, Lx9/M0;->e(S)V

    return-void
.end method

.method protected D([S)Lx9/M0;
    .locals 2

    const-string v0, "$this$toBuilder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx9/M0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lx9/M0;-><init>([SLy7/k;)V

    return-object v0
.end method

.method protected E(Lw9/f;[SI)V
    .locals 3

    .prologue
    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_0

    invoke-virtual {p0}, Lx9/p0;->a()Lv9/f;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Lw9/f;->u(Lv9/f;I)Lw9/j;

    move-result-object v1

    invoke-static {p2, v0}, Li7/K;->D([SI)S

    move-result v2

    invoke-interface {v1, v2}, Lw9/j;->h(S)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Li7/K;

    invoke-virtual {p1}, Li7/K;->S()[S

    move-result-object p1

    invoke-virtual {p0, p1}, Lx9/N0;->A([S)I

    move-result p1

    return p1
.end method

.method public bridge synthetic m(Lw9/d;ILjava/lang/Object;Z)V
    .locals 0

    check-cast p3, Lx9/M0;

    invoke-virtual {p0, p1, p2, p3, p4}, Lx9/N0;->C(Lw9/d;ILx9/M0;Z)V

    return-void
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li7/K;

    invoke-virtual {p1}, Li7/K;->S()[S

    move-result-object p1

    invoke-virtual {p0, p1}, Lx9/N0;->D([S)Lx9/M0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic w()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lx9/N0;->B()[S

    move-result-object v0

    invoke-static {v0}, Li7/K;->d([S)Li7/K;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic z(Lw9/f;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Li7/K;

    invoke-virtual {p2}, Li7/K;->S()[S

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, Lx9/N0;->E(Lw9/f;[SI)V

    return-void
.end method
