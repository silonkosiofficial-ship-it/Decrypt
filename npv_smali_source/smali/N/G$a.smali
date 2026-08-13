.class final LN/G$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/G;->a(ZLX0/i;LN/F;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/F;

.field final synthetic b:Z


# direct methods
.method constructor <init>(LN/F;Z)V
    .locals 0

    iput-object p1, p0, LN/G$a;->a:LN/F;

    iput-boolean p2, p0, LN/G$a;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-object v0, p0, LN/G$a;->a:LN/F;

    iget-boolean v1, p0, LN/G$a;->b:Z

    invoke-virtual {v0, v1}, LN/F;->G(Z)J

    move-result-wide v0

    return-wide v0
.end method
