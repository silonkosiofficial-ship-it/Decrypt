.class final LC/J$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/J;->d(I)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    iput p1, p0, LC/J$d;->D:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LC/J$a;)Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p1}, LC/J$a;->a()I

    move-result p1

    iget v0, p0, LC/J$d;->D:I

    sub-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LC/J$a;

    invoke-virtual {p0, p1}, LC/J$d;->a(LC/J$a;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
