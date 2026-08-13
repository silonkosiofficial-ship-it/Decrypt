.class LJ1/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ1/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/Z;

    invoke-virtual {p0, p1, p2}, LJ1/a$b;->c(Lr/Z;I)LC1/B;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lr/Z;

    invoke-virtual {p0, p1}, LJ1/a$b;->d(Lr/Z;)I

    move-result p1

    return p1
.end method

.method public c(Lr/Z;I)LC1/B;
    .locals 0

    invoke-virtual {p1, p2}, Lr/Z;->p(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC1/B;

    return-object p1
.end method

.method public d(Lr/Z;)I
    .locals 0

    invoke-virtual {p1}, Lr/Z;->n()I

    move-result p1

    return p1
.end method
