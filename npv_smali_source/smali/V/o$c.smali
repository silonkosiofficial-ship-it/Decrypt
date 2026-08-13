.class public final LV/o$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/o;-><init>(LV/g;LV/s;LV/h1;Ljava/util/Set;LW/a;LW/a;LV/G;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LV/o;


# direct methods
.method constructor <init>(LV/o;)V
    .locals 0

    iput-object p1, p0, LV/o$c;->a:LV/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LV/J;)V
    .locals 1

    iget-object p1, p0, LV/o$c;->a:LV/o;

    invoke-static {p1}, LV/o;->W(LV/o;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, LV/o;->c0(LV/o;I)V

    return-void
.end method

.method public b(LV/J;)V
    .locals 1

    iget-object p1, p0, LV/o$c;->a:LV/o;

    invoke-static {p1}, LV/o;->W(LV/o;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, LV/o;->c0(LV/o;I)V

    return-void
.end method
