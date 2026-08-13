.class public final Lg8/e$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg8/t$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg8/e$a;->d(Ln8/f;)Lg8/t$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Ljava/util/ArrayList;

.field final synthetic b:Lg8/e;

.field final synthetic c:Ln8/f;

.field final synthetic d:Lg8/e$a;


# direct methods
.method constructor <init>(Lg8/e;Ln8/f;Lg8/e$a;)V
    .locals 0

    iput-object p1, p0, Lg8/e$a$b;->b:Lg8/e;

    iput-object p2, p0, Lg8/e$a$b;->c:Ln8/f;

    iput-object p3, p0, Lg8/e$a$b;->d:Lg8/e$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lg8/e$a$b;->a:Ljava/util/ArrayList;

    return-void
.end method

.method public static final synthetic f(Lg8/e$a$b;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lg8/e$a$b;->a:Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lg8/e$a$b;->d:Lg8/e$a;

    iget-object v1, p0, Lg8/e$a$b;->c:Ln8/f;

    iget-object v2, p0, Lg8/e$a$b;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Lg8/e$a;->g(Ln8/f;Ljava/util/ArrayList;)V

    return-void
.end method

.method public b(Ln8/b;Ln8/f;)V
    .locals 2

    const-string v0, "enumClassId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enumEntryName"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg8/e$a$b;->a:Ljava/util/ArrayList;

    new-instance v1, Lt8/j;

    invoke-direct {v1, p1, p2}, Lt8/j;-><init>(Ln8/b;Ln8/f;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lg8/e$a$b;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lg8/e$a$b;->b:Lg8/e;

    iget-object v2, p0, Lg8/e$a$b;->c:Ln8/f;

    invoke-static {v1, v2, p1}, Lg8/e;->I(Lg8/e;Ln8/f;Ljava/lang/Object;)Lt8/g;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public d(Ln8/b;)Lg8/t$a;
    .locals 4

    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lg8/e$a$b;->b:Lg8/e;

    sget-object v2, LO7/a0;->a:LO7/a0;

    const-string v3, "NO_SOURCE"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1, v2, v0}, Lg8/e;->w(Ln8/b;LO7/a0;Ljava/util/List;)Lg8/t$a;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance v1, Lg8/e$a$b$a;

    invoke-direct {v1, p1, p0, v0}, Lg8/e$a$b$a;-><init>(Lg8/t$a;Lg8/e$a$b;Ljava/util/ArrayList;)V

    return-object v1
.end method

.method public e(Lt8/f;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg8/e$a$b;->a:Ljava/util/ArrayList;

    new-instance v1, Lt8/p;

    invoke-direct {v1, p1}, Lt8/p;-><init>(Lt8/f;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
