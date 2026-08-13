.class final Lz/f$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/f$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:Ljava/util/List;

.field final synthetic D:LV/w0;


# direct methods
.method constructor <init>(Ljava/util/List;LV/w0;)V
    .locals 0

    iput-object p1, p0, Lz/f$a$a;->C:Ljava/util/List;

    iput-object p2, p0, Lz/f$a$a;->D:LV/w0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/i;

    invoke-virtual {p0, p1, p2}, Lz/f$a$a;->b(Lz/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lz/i;Lm7/e;)Ljava/lang/Object;
    .locals 0

    .prologue
    instance-of p2, p1, Lz/d;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lz/f$a$a;->C:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of p2, p1, Lz/e;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lz/f$a$a;->C:Ljava/util/List;

    check-cast p1, Lz/e;

    invoke-virtual {p1}, Lz/e;->a()Lz/d;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    iget-object p1, p0, Lz/f$a$a;->D:LV/w0;

    iget-object p2, p0, Lz/f$a$a;->C:Ljava/util/List;

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p1, p2}, LV/w0;->setValue(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
