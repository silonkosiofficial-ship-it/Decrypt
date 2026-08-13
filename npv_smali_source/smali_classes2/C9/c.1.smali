.class public final synthetic LC9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic C:Z

.field public final synthetic D:Lx7/p;

.field public final synthetic E:I

.field public final synthetic F:I


# direct methods
.method public synthetic constructor <init>(ZLx7/p;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LC9/c;->C:Z

    iput-object p2, p0, LC9/c;->D:Lx7/p;

    iput p3, p0, LC9/c;->E:I

    iput p4, p0, LC9/c;->F:I

    return-void
.end method


# virtual methods
.method public final u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-boolean v0, p0, LC9/c;->C:Z

    iget-object v1, p0, LC9/c;->D:Lx7/p;

    iget v2, p0, LC9/c;->E:I

    iget v3, p0, LC9/c;->F:I

    move-object v4, p1

    check-cast v4, LV/n;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, LC9/d;->b(ZLx7/p;IILV/n;I)Li7/M;

    move-result-object p1

    return-object p1
.end method
