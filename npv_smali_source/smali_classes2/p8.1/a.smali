.class public abstract Lp8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp8/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp8/a$a;
    }
.end annotation


# instance fields
.field protected C:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lp8/a;->C:I

    return-void
.end method


# virtual methods
.method f()Lp8/v;
    .locals 1

    new-instance v0, Lp8/v;

    invoke-direct {v0, p0}, Lp8/v;-><init>(Lp8/p;)V

    return-object v0
.end method

.method public g(Ljava/io/OutputStream;)V
    .locals 2

    invoke-interface {p0}, Lp8/p;->b()I

    move-result v0

    invoke-static {v0}, Lp8/f;->u(I)I

    move-result v1

    add-int/2addr v1, v0

    invoke-static {v1}, Lp8/f;->t(I)I

    move-result v1

    invoke-static {p1, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object p1

    invoke-virtual {p1, v0}, Lp8/f;->n0(I)V

    invoke-interface {p0, p1}, Lp8/p;->h(Lp8/f;)V

    invoke-virtual {p1}, Lp8/f;->H()V

    return-void
.end method
