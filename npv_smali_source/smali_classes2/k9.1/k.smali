.class public abstract Lk9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/l;


# instance fields
.field private final a:Lk9/n;

.field private final b:I

.field private final c:I

.field private final d:Ljava/util/List;


# direct methods
.method public constructor <init>(Lk9/n;IILjava/util/List;)V
    .locals 1

    const-string v0, "field"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zerosToAdd"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/k;->a:Lk9/n;

    iput p2, p0, Lk9/k;->b:I

    iput p3, p0, Lk9/k;->c:I

    iput-object p4, p0, Lk9/k;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Ll9/e;
    .locals 5

    new-instance v0, Ll9/d;

    new-instance v1, Lk9/k$a;

    iget-object v2, p0, Lk9/k;->a:Lk9/n;

    invoke-interface {v2}, Lk9/n;->b()Lk9/b;

    move-result-object v2

    invoke-direct {v1, v2}, Lk9/k$a;-><init>(Ljava/lang/Object;)V

    iget v2, p0, Lk9/k;->b:I

    iget v3, p0, Lk9/k;->c:I

    iget-object v4, p0, Lk9/k;->d:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3, v4}, Ll9/d;-><init>(Lx7/l;IILjava/util/List;)V

    return-object v0
.end method

.method public b()Lm9/q;
    .locals 7

    new-instance v0, Lm9/q;

    new-instance v1, Lm9/h;

    new-instance v2, Lm9/d;

    iget v3, p0, Lk9/k;->b:I

    iget v4, p0, Lk9/k;->c:I

    iget-object v5, p0, Lk9/k;->a:Lk9/n;

    invoke-interface {v5}, Lk9/n;->b()Lk9/b;

    move-result-object v5

    iget-object v6, p0, Lk9/k;->a:Lk9/n;

    invoke-interface {v6}, Lk9/n;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v2, v3, v4, v5, v6}, Lm9/d;-><init>(IILm9/a;Ljava/lang/String;)V

    invoke-static {v2}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Lm9/h;-><init>(Ljava/util/List;)V

    invoke-static {v1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public final c()Lk9/n;
    .locals 1

    iget-object v0, p0, Lk9/k;->a:Lk9/n;

    return-object v0
.end method
