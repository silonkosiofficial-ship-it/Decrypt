.class public final LD0/h$a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD0/h$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JJ)J
    .locals 0

    invoke-static {p1, p2, p3, p4}, LD0/i;->c(JJ)F

    move-result p1

    invoke-static {p1, p1}, LD0/f0;->a(FF)J

    move-result-wide p1

    return-wide p1
.end method
