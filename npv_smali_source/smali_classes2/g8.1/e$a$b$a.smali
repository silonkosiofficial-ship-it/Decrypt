.class public final Lg8/e$a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg8/t$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg8/e$a$b;->d(Ln8/b;)Lg8/t$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final synthetic a:Lg8/t$a;

.field final synthetic b:Lg8/t$a;

.field final synthetic c:Lg8/e$a$b;

.field final synthetic d:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lg8/t$a;Lg8/e$a$b;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lg8/e$a$b$a;->b:Lg8/t$a;

    iput-object p2, p0, Lg8/e$a$b$a;->c:Lg8/e$a$b;

    iput-object p3, p0, Lg8/e$a$b$a;->d:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/e$a$b$a;->a:Lg8/t$a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lg8/e$a$b$a;->b:Lg8/t$a;

    invoke-interface {v0}, Lg8/t$a;->a()V

    iget-object v0, p0, Lg8/e$a$b$a;->c:Lg8/e$a$b;

    invoke-static {v0}, Lg8/e$a$b;->f(Lg8/e$a$b;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Lt8/a;

    iget-object v2, p0, Lg8/e$a$b$a;->d:Ljava/util/ArrayList;

    invoke-static {v2}, Lj7/v;->G0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LP7/c;

    invoke-direct {v1, v2}, Lt8/a;-><init>(LP7/c;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Ln8/f;Ln8/b;)Lg8/t$a;
    .locals 1

    const-string v0, "classId"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg8/e$a$b$a;->a:Lg8/t$a;

    invoke-interface {v0, p1, p2}, Lg8/t$a;->b(Ln8/f;Ln8/b;)Lg8/t$a;

    move-result-object p1

    return-object p1
.end method

.method public c(Ln8/f;Lt8/f;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg8/e$a$b$a;->a:Lg8/t$a;

    invoke-interface {v0, p1, p2}, Lg8/t$a;->c(Ln8/f;Lt8/f;)V

    return-void
.end method

.method public d(Ln8/f;)Lg8/t$b;
    .locals 1

    iget-object v0, p0, Lg8/e$a$b$a;->a:Lg8/t$a;

    invoke-interface {v0, p1}, Lg8/t$a;->d(Ln8/f;)Lg8/t$b;

    move-result-object p1

    return-object p1
.end method

.method public e(Ln8/f;Ln8/b;Ln8/f;)V
    .locals 1

    const-string v0, "enumClassId"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enumEntryName"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg8/e$a$b$a;->a:Lg8/t$a;

    invoke-interface {v0, p1, p2, p3}, Lg8/t$a;->e(Ln8/f;Ln8/b;Ln8/f;)V

    return-void
.end method

.method public f(Ln8/f;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lg8/e$a$b$a;->a:Lg8/t$a;

    invoke-interface {v0, p1, p2}, Lg8/t$a;->f(Ln8/f;Ljava/lang/Object;)V

    return-void
.end method
