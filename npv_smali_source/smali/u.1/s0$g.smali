.class final Lu/s0$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/s0;-><init>(Lu/v0;Lu/s0;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu/s0;


# direct methods
.method constructor <init>(Lu/s0;)V
    .locals 0

    iput-object p1, p0, Lu/s0$g;->D:Lu/s0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 2

    iget-object v0, p0, Lu/s0$g;->D:Lu/s0;

    invoke-static {v0}, Lu/s0;->a(Lu/s0;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lu/s0$g;->a()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
