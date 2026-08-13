.class public final synthetic LC9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic C:LC9/v;

.field public final synthetic D:Ljava/lang/String;

.field public final synthetic E:Landroidx/compose/ui/d;

.field public final synthetic F:LE9/a;

.field public final synthetic G:Lx7/l;

.field public final synthetic H:I

.field public final synthetic I:I


# direct methods
.method public synthetic constructor <init>(LC9/v;Ljava/lang/String;Landroidx/compose/ui/d;LE9/a;LC9/O;Lx7/l;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/l;->C:LC9/v;

    iput-object p2, p0, LC9/l;->D:Ljava/lang/String;

    iput-object p3, p0, LC9/l;->E:Landroidx/compose/ui/d;

    iput-object p4, p0, LC9/l;->F:LE9/a;

    iput-object p6, p0, LC9/l;->G:Lx7/l;

    iput p7, p0, LC9/l;->H:I

    iput p8, p0, LC9/l;->I:I

    return-void
.end method


# virtual methods
.method public final u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, LC9/l;->C:LC9/v;

    iget-object v1, p0, LC9/l;->D:Ljava/lang/String;

    iget-object v2, p0, LC9/l;->E:Landroidx/compose/ui/d;

    iget-object v3, p0, LC9/l;->F:LE9/a;

    iget-object v5, p0, LC9/l;->G:Lx7/l;

    iget v6, p0, LC9/l;->H:I

    iget v7, p0, LC9/l;->I:I

    move-object v8, p1

    check-cast v8, LV/n;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    const/4 v4, 0x0

    invoke-static/range {v0 .. v9}, LC9/p;->a(LC9/v;Ljava/lang/String;Landroidx/compose/ui/d;LE9/a;LC9/O;Lx7/l;IILV/n;I)Li7/M;

    move-result-object p1

    return-object p1
.end method
