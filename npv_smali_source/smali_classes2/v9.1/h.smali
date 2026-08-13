.class public final synthetic Lv9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:Lv9/i;


# direct methods
.method public synthetic constructor <init>(Lv9/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv9/h;->C:Lv9/i;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv9/h;->C:Lv9/i;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lv9/i;->n(Lv9/i;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
