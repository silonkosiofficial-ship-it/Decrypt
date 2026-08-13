.class final LS/J0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo0/B0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/J0;->a(Lz/j;)LF0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LS/J0;


# direct methods
.method constructor <init>(LS/J0;)V
    .locals 0

    iput-object p1, p0, LS/J0$a;->C:LS/J0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-object v0, p0, LS/J0$a;->C:LS/J0;

    invoke-static {v0}, LS/J0;->c(LS/J0;)J

    move-result-wide v0

    return-wide v0
.end method
