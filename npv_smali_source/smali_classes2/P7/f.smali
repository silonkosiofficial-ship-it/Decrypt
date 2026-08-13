.class public abstract LP7/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ln8/f;

.field private static final b:Ln8/f;

.field private static final c:Ln8/f;

.field private static final d:Ln8/f;

.field private static final e:Ln8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "message"

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    const-string v1, "identifier(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LP7/f;->a:Ln8/f;

    const-string v0, "replaceWith"

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LP7/f;->b:Ln8/f;

    const-string v0, "level"

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LP7/f;->c:Ln8/f;

    const-string v0, "expression"

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LP7/f;->d:Ln8/f;

    const-string v0, "imports"

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LP7/f;->e:Ln8/f;

    return-void
.end method

.method public static final a(LL7/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)LP7/c;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "replaceWith"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "level"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LP7/j;

    sget-object v3, LL7/j$a;->B:Ln8/c;

    sget-object v1, LP7/f;->d:Ln8/f;

    new-instance v2, Lt8/u;

    invoke-direct {v2, p2}, Lt8/u;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p2

    sget-object v1, LP7/f;->e:Ln8/f;

    new-instance v2, Lt8/b;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v4

    new-instance v5, LP7/f$a;

    invoke-direct {v5, p0}, LP7/f$a;-><init>(LL7/g;)V

    invoke-direct {v2, v4, v5}, Lt8/b;-><init>(Ljava/util/List;Lx7/l;)V

    invoke-static {v1, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    const/4 v8, 0x2

    new-array v2, v8, [Li7/u;

    const/4 v9, 0x0

    aput-object p2, v2, v9

    const/4 p2, 0x1

    aput-object v1, v2, p2

    invoke-static {v2}, Lj7/S;->k([Li7/u;)Ljava/util/Map;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, LP7/j;-><init>(LL7/g;Ln8/c;Ljava/util/Map;ZILy7/k;)V

    new-instance v1, LP7/j;

    sget-object v2, LL7/j$a;->y:Ln8/c;

    sget-object v3, LP7/f;->a:Ln8/f;

    new-instance v4, Lt8/u;

    invoke-direct {v4, p1}, Lt8/u;-><init>(Ljava/lang/String;)V

    invoke-static {v3, v4}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p1

    sget-object v3, LP7/f;->b:Ln8/f;

    new-instance v4, Lt8/a;

    invoke-direct {v4, v0}, Lt8/a;-><init>(LP7/c;)V

    invoke-static {v3, v4}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    sget-object v3, LP7/f;->c:Ln8/f;

    new-instance v4, Lt8/j;

    sget-object v5, LL7/j$a;->A:Ln8/c;

    invoke-static {v5}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v5

    const-string v6, "topLevel(...)"

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p3

    const-string v6, "identifier(...)"

    invoke-static {p3, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v5, p3}, Lt8/j;-><init>(Ln8/b;Ln8/f;)V

    invoke-static {v3, v4}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p3

    const/4 v3, 0x3

    new-array v3, v3, [Li7/u;

    aput-object p1, v3, v9

    aput-object v0, v3, p2

    aput-object p3, v3, v8

    invoke-static {v3}, Lj7/S;->k([Li7/u;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {v1, p0, v2, p1, p4}, LP7/j;-><init>(LL7/g;Ln8/c;Ljava/util/Map;Z)V

    return-object v1
.end method

.method public static synthetic b(LL7/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)LP7/c;
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const-string p2, ""

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const-string p3, "WARNING"

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, LP7/f;->a(LL7/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)LP7/c;

    move-result-object p0

    return-object p0
.end method
