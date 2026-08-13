.class public final LS8/H$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR8/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS8/H;->y0(Ljava/lang/CharSequence;)LR8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, LS8/H$a;->a:Ljava/lang/CharSequence;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, LS8/i;

    iget-object v1, p0, LS8/H$a;->a:Ljava/lang/CharSequence;

    invoke-direct {v0, v1}, LS8/i;-><init>(Ljava/lang/CharSequence;)V

    return-object v0
.end method
