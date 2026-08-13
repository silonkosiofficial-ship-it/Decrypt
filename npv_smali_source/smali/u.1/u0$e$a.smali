.class public final Lu/u0$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/u0$e;->a(LV/N;)LV/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lu/s0;

.field final synthetic b:Lu/s0$d;


# direct methods
.method public constructor <init>(Lu/s0;Lu/s0$d;)V
    .locals 0

    iput-object p1, p0, Lu/u0$e$a;->a:Lu/s0;

    iput-object p2, p0, Lu/u0$e$a;->b:Lu/s0$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    iget-object v0, p0, Lu/u0$e$a;->a:Lu/s0;

    iget-object v1, p0, Lu/u0$e$a;->b:Lu/s0$d;

    invoke-virtual {v0, v1}, Lu/s0;->C(Lu/s0$d;)V

    return-void
.end method
