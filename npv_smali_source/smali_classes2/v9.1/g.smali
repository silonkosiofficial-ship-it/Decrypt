.class public final synthetic Lv9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic C:Lv9/i;


# direct methods
.method public synthetic constructor <init>(Lv9/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv9/g;->C:Lv9/i;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv9/g;->C:Lv9/i;

    invoke-static {v0}, Lv9/i;->l(Lv9/i;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
