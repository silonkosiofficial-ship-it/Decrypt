.class public final synthetic LY4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:LY4/h;

.field public final synthetic D:LV4/c;


# direct methods
.method public synthetic constructor <init>(LY4/h;LV4/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY4/f;->C:LY4/h;

    iput-object p2, p0, LY4/f;->D:LV4/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LY4/f;->C:LY4/h;

    iget-object v1, p0, LY4/f;->D:LV4/c;

    invoke-static {v0, v1}, LY4/h;->e(LY4/h;LV4/c;)V

    return-void
.end method
