.class abstract Lg8/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg8/t$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lg8/e;


# direct methods
.method public constructor <init>(Lg8/e;)V
    .locals 0

    iput-object p1, p0, Lg8/e$a;->a:Lg8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ln8/f;Ln8/b;)Lg8/t$a;
    .locals 4

    const-string v0, "classId"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lg8/e$a;->a:Lg8/e;

    sget-object v2, LO7/a0;->a:LO7/a0;

    const-string v3, "NO_SOURCE"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p2, v2, v0}, Lg8/e;->w(Ln8/b;LO7/a0;Ljava/util/List;)Lg8/t$a;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance v1, Lg8/e$a$a;

    invoke-direct {v1, p2, p0, p1, v0}, Lg8/e$a$a;-><init>(Lg8/t$a;Lg8/e$a;Ln8/f;Ljava/util/ArrayList;)V

    return-object v1
.end method

.method public c(Ln8/f;Lt8/f;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt8/p;

    invoke-direct {v0, p2}, Lt8/p;-><init>(Lt8/f;)V

    invoke-virtual {p0, p1, v0}, Lg8/e$a;->h(Ln8/f;Lt8/g;)V

    return-void
.end method

.method public d(Ln8/f;)Lg8/t$b;
    .locals 2

    new-instance v0, Lg8/e$a$b;

    iget-object v1, p0, Lg8/e$a;->a:Lg8/e;

    invoke-direct {v0, v1, p1, p0}, Lg8/e$a$b;-><init>(Lg8/e;Ln8/f;Lg8/e$a;)V

    return-object v0
.end method

.method public e(Ln8/f;Ln8/b;Ln8/f;)V
    .locals 1

    const-string v0, "enumClassId"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enumEntryName"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt8/j;

    invoke-direct {v0, p2, p3}, Lt8/j;-><init>(Ln8/b;Ln8/f;)V

    invoke-virtual {p0, p1, v0}, Lg8/e$a;->h(Ln8/f;Lt8/g;)V

    return-void
.end method

.method public f(Ln8/f;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lg8/e$a;->a:Lg8/e;

    invoke-static {v0, p1, p2}, Lg8/e;->I(Lg8/e;Ln8/f;Ljava/lang/Object;)Lt8/g;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lg8/e$a;->h(Ln8/f;Lt8/g;)V

    return-void
.end method

.method public abstract g(Ln8/f;Ljava/util/ArrayList;)V
.end method

.method public abstract h(Ln8/f;Lt8/g;)V
.end method
