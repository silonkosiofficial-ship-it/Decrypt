.class public final synthetic LS8/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:LS8/m$b;


# direct methods
.method public synthetic constructor <init>(LS8/m$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS8/n;->C:LS8/m$b;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LS8/n;->C:LS8/m$b;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, LS8/m$b;->g(LS8/m$b;I)LS8/j;

    move-result-object p1

    return-object p1
.end method
