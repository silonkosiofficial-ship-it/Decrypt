.class public final synthetic LB9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic C:Lx7/p;

.field public final synthetic D:I

.field public final synthetic E:I


# direct methods
.method public synthetic constructor <init>(Lx7/p;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB9/c;->C:Lx7/p;

    iput p2, p0, LB9/c;->D:I

    iput p3, p0, LB9/c;->E:I

    return-void
.end method


# virtual methods
.method public final u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LB9/c;->C:Lx7/p;

    iget v1, p0, LB9/c;->D:I

    iget v2, p0, LB9/c;->E:I

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, LB9/d;->a(Lx7/p;IILV/n;I)Li7/M;

    move-result-object p1

    return-object p1
.end method
