.class public final LD/C$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/C$a;->a(LV/N;)LV/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LD/B;


# direct methods
.method public constructor <init>(LD/B;)V
    .locals 0

    iput-object p1, p0, LD/C$a$a;->a:LD/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 1

    iget-object v0, p0, LD/C$a$a;->a:LD/B;

    invoke-virtual {v0}, LD/B;->g()V

    return-void
.end method
