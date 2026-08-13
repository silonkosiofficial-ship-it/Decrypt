.class final LV/N0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/M0;
.implements LV/w0;


# instance fields
.field private final C:Lm7/i;

.field private final synthetic D:LV/w0;


# direct methods
.method public constructor <init>(LV/w0;Lm7/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LV/N0;->C:Lm7/i;

    iput-object p1, p0, LV/N0;->D:LV/w0;

    return-void
.end method


# virtual methods
.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, LV/N0;->C:Lm7/i;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LV/N0;->D:LV/w0;

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LV/N0;->D:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
