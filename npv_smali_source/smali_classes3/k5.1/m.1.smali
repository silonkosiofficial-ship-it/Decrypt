.class public Lk5/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/b;


# instance fields
.field private final a:Lk5/C;

.field private final b:Lk5/l;


# direct methods
.method public constructor <init>(Lk5/C;Lq5/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/m;->a:Lk5/C;

    new-instance p1, Lk5/l;

    invoke-direct {p1, p2}, Lk5/l;-><init>(Lq5/g;)V

    iput-object p1, p0, Lk5/m;->b:Lk5/l;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lk5/m;->a:Lk5/C;

    invoke-virtual {v0}, Lk5/C;->d()Z

    move-result v0

    return v0
.end method

.method public b()LT5/b$a;
    .locals 1

    sget-object v0, LT5/b$a;->C:LT5/b$a;

    return-object v0
.end method

.method public c(LT5/b$b;)V
    .locals 3

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "App Quality Sessions session changed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh5/g;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lk5/m;->b:Lk5/l;

    invoke-virtual {p1}, LT5/b$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lk5/l;->h(Ljava/lang/String;)V

    return-void
.end method

.method public d(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk5/m;->b:Lk5/l;

    invoke-virtual {v0, p1}, Lk5/l;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lk5/m;->b:Lk5/l;

    invoke-virtual {v0, p1}, Lk5/l;->i(Ljava/lang/String;)V

    return-void
.end method
