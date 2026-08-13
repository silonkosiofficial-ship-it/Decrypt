.class public final synthetic LC9/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic C:Lt/b;

.field public final synthetic D:Le0/d;

.field public final synthetic E:LC9/g;

.field public final synthetic F:I


# direct methods
.method public synthetic constructor <init>(Lt/b;Le0/d;LC9/g;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/n;->C:Lt/b;

    iput-object p2, p0, LC9/n;->D:Le0/d;

    iput-object p3, p0, LC9/n;->E:LC9/g;

    iput p4, p0, LC9/n;->F:I

    return-void
.end method


# virtual methods
.method public final u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LC9/n;->C:Lt/b;

    iget-object v1, p0, LC9/n;->D:Le0/d;

    iget-object v2, p0, LC9/n;->E:LC9/g;

    iget v3, p0, LC9/n;->F:I

    move-object v4, p1

    check-cast v4, LV/n;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, LC9/p;->b(Lt/b;Le0/d;LC9/g;ILV/n;I)Li7/M;

    move-result-object p1

    return-object p1
.end method
