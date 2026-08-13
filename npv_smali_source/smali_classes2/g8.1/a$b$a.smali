.class public final Lg8/a$b$a;
.super Lg8/a$b$b;
.source "SourceFile"

# interfaces
.implements Lg8/t$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field final synthetic d:Lg8/a$b;


# direct methods
.method public constructor <init>(Lg8/a$b;Lg8/w;)V
    .locals 1

    const-string v0, "signature"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lg8/a$b$a;->d:Lg8/a$b;

    invoke-direct {p0, p1, p2}, Lg8/a$b$b;-><init>(Lg8/a$b;Lg8/w;)V

    return-void
.end method


# virtual methods
.method public b(ILn8/b;LO7/a0;)Lg8/t$a;
    .locals 2

    .prologue
    const-string v0, "classId"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg8/w;->b:Lg8/w$a;

    invoke-virtual {p0}, Lg8/a$b$b;->d()Lg8/w;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lg8/w$a;->e(Lg8/w;I)Lg8/w;

    move-result-object p1

    iget-object v0, p0, Lg8/a$b$a;->d:Lg8/a$b;

    iget-object v0, v0, Lg8/a$b;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lg8/a$b$a;->d:Lg8/a$b;

    iget-object v1, v1, Lg8/a$b;->b:Ljava/util/HashMap;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p1, p0, Lg8/a$b$a;->d:Lg8/a$b;

    iget-object p1, p1, Lg8/a$b;->a:Lg8/a;

    invoke-virtual {p1, p2, p3, v0}, Lg8/b;->y(Ln8/b;LO7/a0;Ljava/util/List;)Lg8/t$a;

    move-result-object p1

    return-object p1
.end method
