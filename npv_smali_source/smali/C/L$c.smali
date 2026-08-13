.class final LC/L$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/L;->b(IILV/n;II)LC/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:I

.field final synthetic E:I


# direct methods
.method constructor <init>(II)V
    .locals 0

    iput p1, p0, LC/L$c;->D:I

    iput p2, p0, LC/L$c;->E:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LC/K;
    .locals 3

    new-instance v0, LC/K;

    iget v1, p0, LC/L$c;->D:I

    iget v2, p0, LC/L$c;->E:I

    invoke-direct {v0, v1, v2}, LC/K;-><init>(II)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LC/L$c;->a()LC/K;

    move-result-object v0

    return-object v0
.end method
