.class final LV/X0;
.super LV/D1;
.source "SourceFile"


# instance fields
.field private final a:LV/D1;

.field private final b:I


# direct methods
.method public constructor <init>(LV/D1;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LV/D1;-><init>(Ly7/k;)V

    iput-object p1, p0, LV/X0;->a:LV/D1;

    iput p2, p0, LV/X0;->b:I

    return-void
.end method
