.class Lq1/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq1/h;->F(Lq1/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:Lq1/h;


# direct methods
.method constructor <init>(Lq1/h;)V
    .locals 0

    iput-object p1, p0, Lq1/h$a;->C:Lq1/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lq1/i;Lq1/i;)I
    .locals 0

    iget p1, p1, Lq1/i;->c:I

    iget p2, p2, Lq1/i;->c:I

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lq1/i;

    check-cast p2, Lq1/i;

    invoke-virtual {p0, p1, p2}, Lq1/h$a;->a(Lq1/i;Lq1/i;)I

    move-result p1

    return p1
.end method
