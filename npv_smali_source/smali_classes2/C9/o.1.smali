.class public final synthetic LC9/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic C:LC9/g;

.field public final synthetic D:Lt/b;

.field public final synthetic E:I


# direct methods
.method public synthetic constructor <init>(LC9/g;Lt/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/o;->C:LC9/g;

    iput-object p2, p0, LC9/o;->D:Lt/b;

    iput p3, p0, LC9/o;->E:I

    return-void
.end method


# virtual methods
.method public final u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LC9/o;->C:LC9/g;

    iget-object v1, p0, LC9/o;->D:Lt/b;

    iget v2, p0, LC9/o;->E:I

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, LC9/p;->d(LC9/g;Lt/b;ILV/n;I)Li7/M;

    move-result-object p1

    return-object p1
.end method
