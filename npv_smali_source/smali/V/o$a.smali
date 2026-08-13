.class final LV/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/c1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final C:LV/o$b;


# direct methods
.method public constructor <init>(LV/o$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV/o$a;->C:LV/o$b;

    return-void
.end method


# virtual methods
.method public final a()LV/o$b;
    .locals 1

    iget-object v0, p0, LV/o$a;->C:LV/o$b;

    return-object v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, LV/o$a;->C:LV/o$b;

    invoke-virtual {v0}, LV/o$b;->s()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, LV/o$a;->C:LV/o$b;

    invoke-virtual {v0}, LV/o$b;->s()V

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method
