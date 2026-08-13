.class final LS/m$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/m$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:Lf0/r;


# direct methods
.method constructor <init>(Lf0/r;)V
    .locals 0

    iput-object p1, p0, LS/m$a$a;->C:Lf0/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/i;

    invoke-virtual {p0, p1, p2}, LS/m$a$a;->b(Lz/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lz/i;Lm7/e;)Ljava/lang/Object;
    .locals 0

    .prologue
    instance-of p2, p1, Lz/g;

    if-eqz p2, :cond_0

    :goto_0
    iget-object p2, p0, LS/m$a$a;->C:Lf0/r;

    invoke-virtual {p2, p1}, Lf0/r;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_0
    instance-of p2, p1, Lz/h;

    if-eqz p2, :cond_1

    iget-object p2, p0, LS/m$a$a;->C:Lf0/r;

    check-cast p1, Lz/h;

    invoke-virtual {p1}, Lz/h;->a()Lz/g;

    move-result-object p1

    :goto_1
    invoke-virtual {p2, p1}, Lf0/r;->remove(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    instance-of p2, p1, Lz/d;

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    instance-of p2, p1, Lz/e;

    if-eqz p2, :cond_3

    iget-object p2, p0, LS/m$a$a;->C:Lf0/r;

    check-cast p1, Lz/e;

    invoke-virtual {p1}, Lz/e;->a()Lz/d;

    move-result-object p1

    goto :goto_1

    :cond_3
    instance-of p2, p1, Lz/n$b;

    if-eqz p2, :cond_4

    goto :goto_0

    :cond_4
    instance-of p2, p1, Lz/n$c;

    if-eqz p2, :cond_5

    iget-object p2, p0, LS/m$a$a;->C:Lf0/r;

    check-cast p1, Lz/n$c;

    invoke-virtual {p1}, Lz/n$c;->a()Lz/n$b;

    move-result-object p1

    goto :goto_1

    :cond_5
    instance-of p2, p1, Lz/n$a;

    if-eqz p2, :cond_6

    iget-object p2, p0, LS/m$a$a;->C:Lf0/r;

    check-cast p1, Lz/n$a;

    invoke-virtual {p1}, Lz/n$a;->a()Lz/n$b;

    move-result-object p1

    goto :goto_1

    :cond_6
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
