.class final LC9/p$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC9/p$d;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LV/q0;


# direct methods
.method constructor <init>(LV/q0;)V
    .locals 0

    iput-object p1, p0, LC9/p$d$a;->C:LV/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1, p2}, LC9/p$d$a;->b(FLm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(FLm7/e;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, LC9/p$d$a;->C:LV/q0;

    invoke-static {p2, p1}, LC9/p;->w(LV/q0;F)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
