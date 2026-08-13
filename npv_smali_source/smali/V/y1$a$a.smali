.class final LV/y1$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/y1$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LV/M0;


# direct methods
.method constructor <init>(LV/M0;)V
    .locals 0

    iput-object p1, p0, LV/y1$a$a;->C:LV/M0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, LV/y1$a$a;->C:LV/M0;

    invoke-interface {p2, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
