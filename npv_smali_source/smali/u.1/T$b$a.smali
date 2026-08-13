.class public final Lu/T$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/T$b;->a(LV/N;)LV/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lu/S;

.field final synthetic b:Lu/S$a;


# direct methods
.method public constructor <init>(Lu/S;Lu/S$a;)V
    .locals 0

    iput-object p1, p0, Lu/T$b$a;->a:Lu/S;

    iput-object p2, p0, Lu/T$b$a;->b:Lu/S$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    iget-object v0, p0, Lu/T$b$a;->a:Lu/S;

    iget-object v1, p0, Lu/T$b$a;->b:Lu/S$a;

    invoke-virtual {v0, v1}, Lu/S;->j(Lu/S$a;)V

    return-void
.end method
