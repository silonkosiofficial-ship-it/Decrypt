.class final Lu/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/B;


# instance fields
.field private final a:Lu/L;


# direct methods
.method public constructor <init>(Lu/L;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/C;->a:Lu/L;

    return-void
.end method


# virtual methods
.method public a(Lu/x0;)Lu/D0;
    .locals 1

    new-instance p1, Lu/J0;

    iget-object v0, p0, Lu/C;->a:Lu/L;

    invoke-direct {p1, v0}, Lu/J0;-><init>(Lu/L;)V

    return-object p1
.end method
