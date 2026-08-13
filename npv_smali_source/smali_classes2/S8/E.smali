.class public final synthetic LS8/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic C:Ljava/util/List;

.field public final synthetic D:Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS8/E;->C:Ljava/util/List;

    iput-boolean p2, p0, LS8/E;->D:Z

    return-void
.end method


# virtual methods
.method public final u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LS8/E;->C:Ljava/util/List;

    iget-boolean v1, p0, LS8/E;->D:Z

    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, LS8/H;->W(Ljava/util/List;ZLjava/lang/CharSequence;I)Li7/u;

    move-result-object p1

    return-object p1
.end method
